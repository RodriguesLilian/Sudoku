import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Main {

 static int M[][] = new int[10][10];
 static int upperbound = 9;

 public static void main(String args[]) {
  IntMatrixGeneration(1, 9);
 }

 // Random Generation
 public static int IntRandomGeneration(int min, int max) {
  Random random = new Random();
  return random.nextInt((max - min) + 1) + min;
 }

 // public static int IntRandomGeneration(int min, int max) {
 // 	ArrayList<Integer> numeros = new ArrayList<Integer>();

 //   for (int i = min; i < max; i++) {
 // 		numeros.add(i);
 // 	}

 // 	Random random = new Random();
 // 	int rand;
 // 	int numeroSorteado;

 // 	for (int i = min; i < max; i++) {
 // 		rand = random.nextInt(numeros.size());
 // 		numeroSorteado = numeros.get(rand);
 // 		numeros.remove(rand);
 // 		return numeroSorteado;
 // 	}
 // }

 // Matrix Generation
 public static void IntMatrixGeneration(int min, int max) {
  for (int i = 0; i < upperbound; i++) {
   for (int j = 0; j < upperbound; j++) {
    M[i][j] = IntRandomGeneration(min, max);
    System.out.printf(M[i][j] + " ");
   }
   System.out.println(" ");
  }
 }

}
