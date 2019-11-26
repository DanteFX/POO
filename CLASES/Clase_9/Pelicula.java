public class Pelicula {
  //   int i =  3 ;
  //
  //   for ( ; i  > 0 ; i-- ) {
  //
  //     int j =  0 ;
  //
  //     while (j  < 5) {
  //
  //       System.out.print(i+" ");
  //
  //       System.out.print(j);
  //
  //       System.out.print(" ");
  //
  //       j++;
  //
  //     }
  //
  //     System.out.println();
  //
  //   }
  // }
  // public static void main(String[] args) {
  //       int[] origen = { 1, 2, 3, 4, 5, 6 };
  //       int[] destino = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
  //       System.arraycopy(origen, 0, destino, 6, 6);
  //       for (int e : origen) {
  //           System.out.print(e+"\t");
  //       }
  //       System.out.println();
  //       for (int e : destino) {
  //           System.out.print(e+"\t");
  //       }
  //       System.out.println();
  //   }
  public static void main(String[] args) {
        int[] origen = { 1, 2, 3, 4, 5, 6 };
        int[] destino = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        System.arraycopy(origen, 0, destino, 2, 2);
        for (int e : origen) {
            System.out.print(e+"\t");
        }
        System.out.println();
        for (int e : destino) {
            System.out.print(e+"\t");
        }
        System.out.println();
    }
}
