import javax.swing.*;

public class SudokuSolver
   {
   public static void main( String[] args )
      {
      int[][] puzzle = new int[9][9];
      
      for( int r = 0; r < 9; r++ )
         {
         for( int c = 0; c < 9; c++ )
            {
            String currentGrid = "\n";
            for( int r2 = 0; r2 < 9; r2++ )
               {
               for( int c2 = 0; c2 < 9; c2++ )
                  {
                  if( puzzle[r2][c2] == 0 )
                     {
                     if( r2 < r || (r2 == r && c2 < c) )
                        {
                        currentGrid += "" + puzzle[r2][c2] + " ";
                        } // end if
                     else
                        {
                        currentGrid += "- ";
                        } // end else
                     } // end if
                  else
                     {
                     currentGrid += "" + puzzle[r2][c2] + " ";
                     } // end else
                  } // end for
               currentGrid += "\n";
               } // end for
            String num = JOptionPane.showInputDialog( null, (r+1)+" "+(c+1) + currentGrid );
            try
               {
               puzzle[r][c] = Integer.parseInt( num );
               } // end try
            catch( Exception e )
               {
               puzzle[r][c] = 0;
               } // end catch
            } // end for
         } // end for
      
      
      Solver s = new Solver( puzzle );
      s.solve();
      } // end method main
   } // end class SudokuSolver