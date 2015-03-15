public class Space
   {
   private boolean[] options;
   private int num;
   private boolean isSolved;
   
   public Space( int num )
      {
      this.num = num;
      options = new boolean[9];
      if( num == 0 )
         {
         for( int index = 0; index < 9; index++ )
            {
            options[index] = true;
            } // end for
         isSolved = false;
         } // end if
      else
         {
         for( int index = 0; index < 9; index++ )
            {
            options[index] = false;
            } // end for
         isSolved = true;
         } // end else
      } // end constructor Space
   
   public void setNum( int n )
      {
      num = n+1;
      } // end method setNum
   public int getNum()
      {
      return num;
      } // end method getNum
      
   public void setOption( int index, boolean canBe )
      {
      options[index-1] = canBe;
      } // end method setOption
   public boolean[] getOption()
      {
      return options;
      } // end method getOption
   public boolean getOption( int index )
      {
      return options[index-1];
      } // end method getOption
   
   public boolean isSolved()
      {
      return isSolved;
      } // end method isSolved
   public void setIsSolved( boolean solved )
      {
      isSolved = solved;
      } // end method isSolved
   
   public String toString()
      {
      if( num == 0 )
         {
         return " ";
         } // end if
      return "" + num;
      } // end method toString
   } // end class Space