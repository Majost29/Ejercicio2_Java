import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int lado1;
    int lado2;
    int base;
  Scanner triObj = new Scanner (System.in);
    
    System.out.println("Ingresar valor del lado1");
    lado1= triObj.nextInt();
    System.out.println("Ingresar valor del lado2");
    lado2= triObj.nextInt();
    System.out.println("Ingrese el valor de la base");
    base= triObj.nextInt();
    
    if(lado1>=1 && lado2>=1 && base>=1){
      // Triángulo Equilatero
      
      if(lado1==base && lado2==base && lado1==lado2){
        double altura=(Math.sqrt(3)*lado1)/2;
        double area=((base*altura)/2);
        System.out.println("El area es;"+area);
        System.out.println("Los Datos ingresados corresponden a un triangulo equilatero");
      }else{
        // Triangulo Isoceles
        
        if(lado1==lado2){
          double altura=Math.sqrt((lado1*lado1)-(base*base/4));
          double area=((base)*(Math.sqrt((lado1*lado1)-((base*base)/4))/2));
          System.out.println("El area es;"+area);
          System.out.println("Los Datos ingresados corresponden a un triangulo isósceles");
        }else{
          // Triangulo Escaleno
          if(lado1!=lado2 && lado1!=base && lado2!=base){
            double semip=((lado1+lado2+base)/2);
            double area=Math.sqrt(semip*((semip-base)*(semip-lado1)*(semip-lado2)));
            System.out.println("El area es;"+area);
            System.out.println("Los Datos ingresados corresponden a un triangulo escaleno");
          }
        }
      }
    }else{
      System.out.println("Los valores ingresados no son correctos");
    }                                      
  }
}
// 1 relaizar un programa que calcule el area de un triangulo cocnociendo sus lados
// debe tener en cuenta que :no negativos puede ingresar ni valores a 1000
// 2 identificar tipo de triangulo que es
// 3 identificar tipo de determinantte 
// 4 no se puede ingresar caracteres
// 5 pruebas unitarias en java 