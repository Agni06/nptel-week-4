package myPack;
class Balance
  {
  String name;
  double bal;
   Balance(String name, double bal)
    {
      this.name = name;
      this.bal = bal;
      
    }

    public void show()
    {
      if(bal<0)
      {
        System.out.println("account is death ");
      }
      else
      {
        System.out.println("name : " +name + " " +bal);
      }
    }
  }

class accountBalance
  {
     public static void main(String, args[])
    {
Balance cur[] = new Balance[3];
      cur[0]  = new Balance("Agni", 999.7);
      cur[1] = new Balance("charan" ,324.78);
      curr[2] = new Balance("teja" , 99.0);
      for(int i=0;i<3;i++)
        {
          curr[i].show();
        }
      
      
    }
  }
