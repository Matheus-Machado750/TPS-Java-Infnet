PS C:\Users\maril> jshell\
|  Welcome to JShell -- Version 21.0.12\
|  For an introduction type: /help intro

jshell> int minutos = 125;\
minutos ==> 125

jshell> double valorHora = 8.5;\
valorHora ==> 8.5

jshell> long limiteMinutos = 120L;\
limiteMinutos ==> 120

jshell>

jshell> int horas = minutos / 60;\
horas ==> 2

jshell> int resto = minutos % 60;\
resto ==> 5

jshell> double total = valorHora * horas;\
total ==> 17.0

jshell>

jshell> System.out.println(minutos > limiteMinutos);
