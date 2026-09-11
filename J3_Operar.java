public class J3_Operar {
    public static void main(String[] args){
        // Operadores
        
        // Aritmeticos
        var a = 5;
        var b = 3;
        /*System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);//si quiero con decimales entonces una de las variables debe ser double o float
        System.out.println(a%b);*/

        //Asignacion
        /*
        a = b;    a la variable 'a' se asigna el valor de b
        a = b * 2;  a la variable 'a' se le asigna el valor de b*2
        a += 1;     el valor de 'a' aumenta en 1
        a -= 1;     el valor de 'a' disminuye en 1
        a*= 2;      el valor de 'a' se duplica
        a /= 2;     el valor de 'a' se divide en 2
        */
        
        //Comparacion, devuelven true o false
        /*System.out.println(a==b);
        System.out.println(a==5);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<b);
        System.out.println(a<=b);

        //Logico, usan la tabla de verdad para devolver true o false
        System.out.println(true && true); //"&&"operador conjuncion
        System.out.println(true && false);
        System.out.println(true || true);
        System.out.println(false || false);

        //NO, niega el valor de verdad
        System.out.println(!true);  //devuelve false
        System.out.println(!false); //devuelve true*/

        //Unario
        /*System.out.println(+b);    //solo devuelve el mismo b
        System.out.println(-b);    //devuelve b con el signo cambiado
        System.out.println(++b);   //aumenta en 1 'b' y luego lo imprime
        System.out.println(b++);   //imprime b y luego lo aumenta en 1
        System.out.println(--b);   //disminuye en 1 'b' y luego lo imprime
        System.out.println(b--);   //imprime b y luego lo disminuye en 1 */

        //Ejercicios
        //1)
        int suma         = a + b;   
        int resta        = a - b;   
        int multiplicacion = a * b; 
        int division     = a / b;  
        int modulo       = a % b; 
        
        //2)
        int c = 5;   
        int d;   
        d = c;
        System.out.println(d);        
        d = c * 2;
        System.out.println(d);  
        d += 1;     
        System.out.println(d);
        d -= 1;     
        System.out.println(d);
        d*= 2;      
        System.out.println(d);
        d /= 2; //d al final es 10
        System.out.println(d);

        //3
        System.out.println(d > c);
        System.out.println(2 < d-c);
        System.out.println(b*c <= a*d);

        //4
        System.out.println(4 <= 2);
        System.out.println(10 >= 98);
        System.out.println(2*8 > 32/2);

        //5)
        System.out.println((10<42)&&(7>2));

        //6)
        System.out.println((47<24)||(4<= 1));

        //7)
        System.out.println(((47<24)||(4<= 1))&&((10<42)&&(7>2)));

        //8)
        System.out.println(!((47<24)||(4<= 1))&&((10<42)&&(7>2)));

        //9)
        int i = 19;
        System.out.println(++i);
        System.out.println(-i);
        System.out.println(--i);
    }
}
