package com.patterns;

/*
 1-SIZE > how many rows you want in the pattern
 
 2-PUTTINNG TOGETHER NESTED LOOPS
 
 *  >>> system.out.println("*");
 
 * * * * * >>>  int n=5;
             for(int i=1;i<=n;i++){
             sout("*");
             }
             
  3-PRINT AND PRINTLN STATEMENT
  
  * * * * *  >>> for(int i =1;i<=n;i++){
  * * * * *        for(int i=1;i<=n;i++){
  * * * * *           soutPRINT("*");
  * * * * *         }
                      soutPRONTLN(); //dont forget to put println statment (key points);
                      }
                    }
  
  4- INCREASING TRIANGLE PATTERN
  
  *                    >>> int n=5;
  * *                    outer raws for(int i=1;i<=n;i++){
  * * *                         inner colums   for(int j=1;j<=i;J++){    change only j<=i (key points   )                                            
  * * * *                                sout("*");
  * * * * *                             }                               
                                       soutPRINTLN("*");
                                    }
                                 }
                                 
 5-  DECREASING TRAINGLE PATTERN  
 
   * * * * *       >>> 
   * * * *
   * * *
   * *
   *    
   
   6- RIGHT SIDED TRAINGLE 
   
               >>> int n=5;                   |       >>> int n=5;                      * * * * *
                                              |        for(int i=1;i<=n;i++){             * * * *
             for ( int i=1;i<=n:i++){         |             for(int j=1;j<=i;j++){          * * *
             for(int j=i;j<=n;J++){           |                   sout("");                   * *
               sout(" ");                     |            }                                   *
               }                              |              for(int j=i;j<+=n;j++){
                for(int j=1;j<=i;j++){        |                    sout("*");
                sout(" *");                   |                }
                }                             |                   sout();
                 sout();                      |              }
        *         }                           |
      * *                                     |
    * * *                                     |
  * * * *
* * * * *
  
 7. HILL PATTERN
 
                  *         >>> int n=5;;
                 * *          for(int i=1;i<+n;i++){
                * * *              for(int j=i;j<=n;j++){
              * * * * *                sout(" ");
            * * * * * * *          }
           * * * * * * * * *         for(int j=1;j<=i;j++){
                                        sout("*");
                                       } 
                                         sout();
                                         }

8.REVERSE HILL PETTERN


*/
public class starepattnNotes {

	public static void main(String[] args) {
     int n=5; 
   //  for(int i=1;i<=n;i++) {
   //  for( int j=1;j<=i;j++) {
    	 System.out.print("* ");
     }
 // System.out.println();
}
