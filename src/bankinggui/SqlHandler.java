/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankinggui;

import java.sql.*;

/**
 *
 * @author fragger
 */
public class SqlHandler
{
        final private static String sqlU="root";
        final private static String sqlP="root";
        final private static String defAccNo = "11111";
        final private static int MAX_HISTORY = 5;
        final private static float minBal=1000;
        private static String emptyEntry= new String("----");
        String initials;
        
        private String accNo;
        public String name;
        private float balance;
	private String pin;
	int attempts;
        private boolean isLocked;
        String securityQ;
        private int securityA;
        private String gender;
        private boolean mStatus;
       
        String dob;
        String addressL1;
        String addressL2;
        String addressL3;
        
        String[] tDetails;
        Timestamp[] tD;
        
        String[] tDate;
        String[] tTime;
        
			
	static boolean writeRecord(String accNo,String name, float balance, String
                pin, String securityQ, int securityA, String gender, boolean 
               mStatus, String dob, String addressL1, String addressL2, 
               String addressL3)
            {
		Connection con = null;
                PreparedStatement pmt = null;
               
		String query = null;
					
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost/BankAccount?" +
                    "user=root&password=root");
							
                query = "insert into Accounts values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		pmt = con.prepareStatement(query);
							
		pmt.setString(1,accNo);
		pmt.setString(2,name);
		pmt.setFloat(3,balance);
                pmt.setString(4,pin);
                pmt.setInt(5, User.MAXATTEMPTS );
                pmt.setBoolean(6, false);
                pmt.setString(7, securityQ);
                pmt.setInt(8, securityA);
                pmt.setString(9, gender);
                pmt.setBoolean(10, mStatus);
                pmt.setString(11, dob);
                pmt.setString(12, addressL1);
                pmt.setString(13, addressL2);
                pmt.setString(14, addressL3);
                
                for(int i=0;i<MAX_HISTORY;i++)
                    {
                        pmt.setNull(15+i,Types.VARCHAR);
                        pmt.setNull(15+MAX_HISTORY+i,Types.TIMESTAMP);
                    }
							
		int r = pmt.executeUpdate();
                    if(r>0) return true;
                return false;
		}
		catch (ClassNotFoundException ce)
		{
		ce.printStackTrace();
		}
		catch(SQLException se)
                {
		se.printStackTrace();
		}
		finally
		{
		try
                {
		con.close();
		}
                catch(SQLException se)
                {}
                }
            return false;
                
         }
         
    static String getLastAccNo()
    {
        Connection con = null;
	Statement smt = null;
	ResultSet rs = null;
	String query = null;
				
	String aN;
				
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost/BankAccount?" +
                    "user=root&password=root");
                smt = con.createStatement();
		query = "select accNo from Accounts";
		rs = smt.executeQuery(query);
		rs.next();
                  
                
		do
		{
                   aN = rs.getString(1);
                }
                while(rs.next());
                if(aN!=null) return aN;
                
                return defAccNo;
        }
	catch (ClassNotFoundException ce)
        {
	ce.printStackTrace();
	}
	catch(SQLException se)
	{
	se.printStackTrace();
        }
	finally
	{
		try
		{
                con.close();
                }
		catch(SQLException se)
		{}
						}

        return defAccNo;
    }
				
			
     boolean matchAccNumber(String aNo)
                {
					Connection con = null;
					Statement smt = null;
					ResultSet rs = null;
					String query = null;
					
					String aN;
					String p;
                                        
                                        tDetails = new String[MAX_HISTORY];
                                        tDate = new String[MAX_HISTORY];
                                        tTime = new String[MAX_HISTORY];
                                        tD = new Timestamp[MAX_HISTORY];
				
					try
					{
						Class.forName("com.mysql.jdbc.Driver");
                                                con = DriverManager.getConnection("jdbc:mysql://localhost/BankAccount?" +
                                                "user=root&password=root");
						smt = con.createStatement();
						query = "select * from Accounts";
						rs = smt.executeQuery(query);
						
						while(rs.next())
							{
								aN=rs.getString(1);
								p = rs.getString(4);
								
								
								if(aN.equals(aNo))
									{
									this.accNo=aN;
									this.pin = p;
									this.balance = rs.getFloat(3);
									this.name = rs.getString(2);
                                                                        this.attempts = rs.getInt(5);
                                                                        this.isLocked = rs.getBoolean(6);
                                                                        this.securityQ = rs.getString(7);
                                                                        this.securityA = rs.getInt(8);
                                                                        this.gender = rs.getString(9);
                                                                        this.mStatus = rs.getBoolean(10);
                                                                        this.dob = rs.getString(11);
                                                                        this.addressL1 = rs.getString(12);
                                                                        this.addressL2 = rs.getString(13);
                                                                        this.addressL3 = rs.getString(14);
                                                                      
                                                                        String tDet;
                                                                        for(int i = 0; i<MAX_HISTORY; i++)
                                                                            {
                                                                                tDet = rs.getString(15+i);
                                                                                if(rs.wasNull()) 
                                                                                    this.tDetails[i]=new String(emptyEntry);
                                                                                else
                                                                                    this.tDetails[i] = new String(tDet);
                                                                                
                                                                                tD[i] = rs.getTimestamp(15+MAX_HISTORY+i);
                                                                                
                                                                                if(rs.wasNull())
                                                                                    {
                                                                                    this.tDate[i]=new String(emptyEntry);
                                                                                    this.tTime[i]=new String(emptyEntry);
                                                                                    }
                                                                                else
                                                                                {
                                                                                    java.util.Date d = new java.util.Date(tD[i].getTime());
                                                                                    this.tDate[i] = new String((d.getDate())+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));
                                                                                    this.tTime[i] = new String(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
                                                                                }
                                                                            }
                                                                        
                                                                        if(gender.equals("F") || gender.equals("f"))
                                                                        {
                                                                            if(mStatus) this.initials = "Mrs.";
                                                                            else this.initials = "Miss";
                                                                        }
                                                                        
                                                                        else this.initials = "Mr.";
                                                                        									
									return true;
									}
							}
						return false;
					}
					catch (ClassNotFoundException ce)
						{
							ce.printStackTrace();
						}
					catch(SQLException se)
						{
							se.printStackTrace();
						}
					finally
						{
							try
							{
							con.close();
							}
							catch(SQLException se)
								{}
						}
				return false;
				
}
						
	
         boolean matchPin(String p)
        {
            if(pin.equals(p))
                return true;
            else return false;
        }
        
         void setAttempts(int atmpt)
        {
                                        Connection con = null;
					PreparedStatement pmt = null;
					String query = null;
                                        attempts = atmpt;
                                        
					try
					{
						Class.forName("com.mysql.jdbc.Driver");
                                                con = DriverManager.getConnection("jdbc:mysql://localhost/BankAccount?" +
                                                "user=root&password=root");
						query = "update Accounts set PinAttempts = ? where accNo = ?";
                                                pmt = con.prepareStatement(query);
						
						
                                                pmt.setInt(1,attempts);
                                                pmt.setString(2,accNo);
                                                
                                                int r = pmt.executeUpdate();
						
                                                if(attempts<=0)
                                                {
                                                  query = "update Accounts set isLocked = ? where accNo = ?";
                                                  pmt = con.prepareStatement(query);
                                                  pmt.setBoolean(1,true);
                                                  pmt.setString(2,accNo);
                                                  isLocked = true;
                                                  r = pmt.executeUpdate();
                                                }
                                                
					}
					catch (ClassNotFoundException ce)
						{
							ce.printStackTrace();
						}
					catch(SQLException se)
						{
							se.printStackTrace();
						}
					finally
						{
							try
							{
							con.close();
							}
							catch(SQLException se)
								{}
						}
				
				}
        
        
        void updateRecord()
		{
				Connection con = null;
				PreparedStatement pmt = null;
										
				String query = null;
					
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
                                        con = DriverManager.getConnection("jdbc:mysql://localhost/BankAccount?" +
                                        "user=root&password=root");
							
					query = "update Accounts set Balance = ?, pin = ?, isLocked = ?, SecurityQ = ?, SecurityA = ?, Gender = ?, MStatus = ?"
                                                + ", T1 = ?, T2 = ?, T3 = ?, T4 = ?, T5 = ?, TD1 = ?, TD2 = ?, TD3 = ?, TD4 = ?, TD5 = ?"
                                                + " where accNo = ?";
					pmt = con.prepareStatement(query);
							
					pmt.setFloat(1,balance);
					pmt.setString(2,pin);
					pmt.setBoolean(3,isLocked);
					pmt.setString(4,securityQ);
					pmt.setInt(5,securityA);
					pmt.setString(6,gender);
					pmt.setBoolean(7,mStatus);
                                        
                                        for(int i=0;i<MAX_HISTORY;i++)
                                        {
                                            if(tDetails[i].equals(emptyEntry))
                                                {
                                                   pmt.setNull(8+i,Types.VARCHAR);
                                                   pmt.setNull(8+MAX_HISTORY+i,Types.TIMESTAMP);
                                                }
                                            else
                                            {
                                                pmt.setString(8+i,tDetails[i]);
                                                pmt.setTimestamp(8+MAX_HISTORY+i,tD[i]);
                                            }
                                        }
                                        
					pmt.setString(8+MAX_HISTORY+MAX_HISTORY,accNo);
                                        
							
					int r = pmt.executeUpdate();
                                        
					}
					catch (ClassNotFoundException ce)
						{
							ce.printStackTrace();
						}
					catch(SQLException se)
						{
							se.printStackTrace();
						}
					finally
						{
							try
							{
							con.close();
							}
							catch(SQLException se)
								{}
						}
				}
        
         boolean lockState()
        {
                return isLocked;
        }
        
	 String getName()
        { return name; }
		
	 String getPin()
           { return pin; }
				
        float getBal()
            { return balance; }
					
	String getAccNo()
            { return accNo; }    
        
       void setSecurityA(int s)
            { securityA = s; }
       
       void setLock(boolean l)
             { isLocked = l; 
                updateRecord();
             }
        
       void deposit(float amt)
        {
            balance = balance+amt;
            String t = "Deposited "+amt+" into account";
            saveTrans(t);
            updateRecord();
        }
        
        boolean withdrawl(float amt)
        {
              if(balance-amt>=minBal)
              {
                 balance = balance - amt;
                 String t = "Withdrawn "+amt+" from account";
                 saveTrans(t);
                 return true;
              }
              else
                   return false;
        }
        
        boolean matchSecurityA(int a)
        { 
            if(securityA == a)
                    return true;
            else 
                return false;
        }
        
        void setPin(String p)
        {
            pin = p;
            updateRecord();
        }
        
        static boolean balTransfer(SqlHandler sender, SqlHandler receiver, float amount)
        {
            if(sender.balance-amount>=minBal)
              {
                 sender.balance -= amount;
                 receiver.balance+=amount;
                 String t1 = "Transferred "+amount+" to Account Number: "+receiver.getAccNo();
                 String t2 = "Received "+amount+" from Account Number: "+sender.getAccNo();
                 sender.saveTrans(t1);
                 receiver.saveTrans(t2);
                 return true;
              }
              else
                   return false;
        }
        
        String[][] getTrans()
        {
            String[][] trans = new String[MAX_HISTORY][4];
            for(int i=0;i<MAX_HISTORY;i++)
            {
                trans[i][0]=Integer.toString(i+1);
                trans[i][1]=tDetails[i];
                trans[i][2]=tDate[i];
                trans[i][3]=tTime[i];
            }
            return trans;
        }
        
        void saveTrans(String trans)
        {
            java.util.Date d1 = new java.util.Date();
            
            Timestamp t = new Timestamp(d1.getTime());
            int i;
            for(i=0; i<MAX_HISTORY; i++)
            {
               if(tDate[i].equals(emptyEntry))
                   break;
            }
            
            if(i>=MAX_HISTORY)
            {
                for(int j=0;j<4;j++)
                {
                    tD[j]=tD[j+1];
                    tDetails[j]=tDetails[j+1];
                    tDate[j]=tDate[j+1];
                    tTime[j]=tTime[j+1];
                }
                i=MAX_HISTORY-1;
            }
            
            tD[i]=t;
            tDetails[i]=trans;
            tDate[i] = new String((d1.getDate())+"/"+(d1.getMonth()+1)+"/"+(d1.getYear()+1900));
            tTime[i] = new String(d1.getHours()+":"+d1.getMinutes()+":"+d1.getSeconds());
            
            updateRecord();
            
        }
    
        
}
