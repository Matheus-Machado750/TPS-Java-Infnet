## Questão 02

O Java consegue funcionar em diferentes sistemas operacionais porque utiliza uma estrutura chamada JVM (Java Virtual Machine).
Quando escrevemos um código Java, o compilador javac transforma esse código em bytecode, que é armazenado em arquivos com extensão .class. 
Esse bytecode não depende diretamente do Windows ou Linux, permitindo que seja utilizado em diferentes sistemas. 
Quando executamos o programa, a JVM carrega e interpreta o bytecode, podendo também utilizar o compilador JIT para transformá-lo em código de máquina. 
Dessa forma, cada sistema operacional possui uma JVM compatível com seu ambiente. 
É importante destacar que o javac produz o bytecode, enquanto o java inicia a execução desse bytecode por meio da JVM. 
Assim, não precisamos recompilar o mesmo código para cada sistema operacional, desde que exista uma JVM compatível.
