Informe sobre Fibo4

-CUMPLIMIENTO DE CONSIGNAS
El programa cumple con las funcionalidades requeridas de manera correcta.

-TEST
Pose una buena cantidad de test ya que pose una cobertura de  del 88%. Respecto al porcentaje faltante, 
se debe en parte a que no hay pruebas para cuando se generar un archivo, este lance una excpeciones.
Ademas, GeneradorDeArchivosTest contiene 2 test, los cuales no estan probando nada, sino que solo generan el archivo, 
lo escriben pero no se realiza ningun chequeo de que realmente se genera dicho archivo con el contenido apropiado.

-CONVECION JAVA
En el codigo se encuentra bien aplicado las convenciones para java, como las sangrias de un tabulador(4 espacios en blanco), las llaves se abren 
en la linea de la sentencia y finalizan a la misma sangria mas abajo, 
las clases comienzan con mayuscula y se aplica camelcase en todos las variables, clases, metetodos etc.
Por cada sentencia solo se declara una variable, estas comienzan con miniscula, al igual que los metodos.
Aplica bien los espacios en blanco, tanto entre las palabras clave y los parentesis y entre los operadores binarios.
Aplica correctamente las lineas en blanco, de 1, en el caso de los metodos.
Donde no aplica las lineas en blanco es en el caso de un metodo, entre las varibales locales y su primer sentencia como se observa en el siguiente metodo de la clase
ManejadorFibonacci :

    private String armarSalida() {
        String resultado = this.cabeceraTxt;
        if (this.miProcesador.puedoSumarVaroles()) {
            resultado = resultado + "s";
        }
        resultado = resultado + ":";
        armarCuerpo();
        resultado = resultado + darCuerpoDelFibonacci();
        return resultado;
    }

-PRINCIPIOS SOLID :
1. Single Responsibility Principle / Principio de Responsabilidad Única
Como se puede observar en la clase ManejadorFibonacci tiene mas de una responsabilidad lo que genera un gran acoplamiento en dicha clase, ya que se encarga de:
 	-Ejecutar la sucesion --> public int ejecutarFibonnaci(int unNumeroFibonacci)
	-Imprimir la sucesion -->public void imprimirFibonacci(int numeroFibonacciAImprimir)
	-Generar la salida --> private String armarSalida() 
	-Ademas contiene el main.
Esto se prodria solucionar si estas responsabilidades se traspasan a otras clases, que a su vez se encarguen de una de estas responsabilidades, por ejemplo,
se podria crear la clase ImprimirFibonacci la cual se encargue de la impresion, y asi retirar el metodo de la clase ManejadorFibonacci.

2. Dependency inversion principle / Principio de inversión de dependencias
Este principio se rompe en la clase ManejadorFibonacci, esta contiene una instancia de Fibonacci, lo que genera un acoplamiento innecesario, ya que 
si el dia de mañana ademas de calcular Fibonnaci realiza otra funcion matematica, ocacionaria que se tenga que modificar dicha variable, o tener que crear
nuevamente una instancia. Para ello seria mejor que Fibonnaci se extendiera de una interface, la cual podria ser FuncionMatematica, asi si el dia de mañana
se agregan nuevas funciones, deberian implementar esta y no se deberia realizar cambios en la clase ManejadorFibonacci.

-POSIBLES SMELLS
.Para los distintas opciones de formato, sentido, orientacion, etc,  la logica para aplicar uno u otro es es a traves de booleanos en la clase ProcesadorDeParametros,
la pregunta es que  sucederia si el dia de mañana por ejemplo se agrega un nuevo comportamiento, como puede ser una nueva funcionalidad que reste numeros, tendria
que agregar un booleano por cada funcionalida ?

.Hay codigo repetido :

    	private void definirSalidaHorizontalOVertical(String parametros) {
       	    this.expresionRegular = "(\\-)+([o])=([vh][id]\\b)";
            this.patron = Pattern.compile(expresionRegular);
            this.emparejador = patron.matcher(parametros);
            this.esCoincidente =emparejador.find();
            if (this.esCoincidente){
                imprimeEnVertical(parametros.contains("v"));
                ejecutarEnOrdenInverso(parametros.contains("i"));
                encontroParametros(true);
            }
        }
	
	private void definirSalidaListaOSumatoria(String parametro) {
	    this.expresionRegular = "(\\-)+([m])=([ls]\\b)";
            this.patron = Pattern.compile(expresionRegular);
            this.emparejador = patron.matcher(parametro);
            this.esCoincidente =emparejador.find();
            if (this.esCoincidente){
                aplicarSumaDeValores(parametro.contains("s"));
            	encontroParametros(true);
       	    }
        }
	
Esto podria solucionarlo si se creara un solo metodo, el cual podria ser :
	private void definirSalida(String parametro)  {
	    this.expresionRegular = "(\\-)+([m])=([ls]\\b)";
            this.patron = Pattern.compile(expresionRegular);
            this.emparejador = patron.matcher(parametro);
            this.esCoincidente =emparejador.find();
            if (this.esCoincidente){
		//Dicho metodo podria implementarse en distintas clases, que a traves del polimorfirmo aplique la funcionalidad adecuada.
	        aplicarFuncionalidad();     									
	    }
	}	

.En clase ProcesadorDeParametros hay muchas variables booleanas, con sus respectivos getters, lo cual genera que sea dificil de "leer" el codigo.

.La mayoria de los metodos no soportaria el añadimiento un nuevo comportamiento, como puede ser en el caso de :
	
	private void definirSalidaHorizontalOVertical(String parametros)  {
	    this.expresionRegular = "(\\-)+([o])=([vh][id]\\b)";
            this.patron = Pattern.compile(expresionRegular);
            this.emparejador = patron.matcher(parametros);
            this.esCoincidente =emparejador.find();
            if (this.esCoincidente){
                imprimeEnVertical(parametros.contains("v"));
                ejecutarEnOrdenInverso(parametros.contains("i"));
                encontroParametros(true);
            }
        }
	
Ademas la firma del metodo habla de definir si la salida es horizontal o vertical, pero, ademas de definir orientacion, tambien define si debe ejecutar orden inverso,
por lo que el metodo esta realizando mas de una sola responsabilidad, por lo que estaria violando la Responsabilidad Unica.

	