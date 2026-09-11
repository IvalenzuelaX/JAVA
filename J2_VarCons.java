public class J2_VarCons {
    public static void main(String[] args){
        String name = "Alexander";
        System.out.println(name);

        int age = 20;
        System.out.println(age);

        var correo = "ivalenzuelavaz@gmail.com"; /*var lo que hace es detectar el tipo de variable y, 
        si quiero cambiar el valor tengo que mantener el mismo tipo*/
        System.out.println(correo);
        
        //Constantes
        final String CORREO = "ivalenzuelavaz@gmail.com"; //final vuelve una variable constante
        System.out.println(CORREO);
        //CORREO = "ivalenzuelavaz@gmail.com"; no puede cambiar (error)

        //Ejercicios
        //1)
        String nombre = "Alexander";
        
        //2)  
        int edad = 20;
        
        //3)  
        double altura = 1.83;
        
        //4)
        boolean gustar = true;
       
        //5)
        final String EMAIL = "ivalenzuelavaz@gmail.com";
        
        //6)  
        char inicial = 'I';
        
        //7)  
        String localidad = "Lima";
        System.out.println(localidad);
        localidad = "villa_el_salvador";
        System.out.println(localidad);
        
        //8)  
        int a = 6;
        int b = 7;
        int c = a+b;
        System.out.println(c);
        
        //9)  
        System.out.println(((Object)edad).getClass().getSimpleName());  //imprime el tipo de variable
        System.out.println(((Object)altura).getClass().getSimpleName());  
        
    }
}