#Mòdul3 Programació - 2on examen
##UF2. Disseny modular
##NF1. Escriu i prova programes senzills reconeixent i aplicant els fonaments de la programació modular.	

###Consideracions:
1. Heu de donar solució als següents problemes però complint els següents requisits:
  - en el mètode main que s'us passa només podeu fer:
    - crides a les funcions
    - recollir el seu valor de retorn, si escau.
    - pintar alguna cosa per pantalla, si escau.
    - recollir alguna dada de l'usuari.
  - en les funcions que codifiqueu:
    - no podeu imprimir res per pantalla (no System.out.println)
    - no podeu recollir cap dada de l'usuari
2. Mireu les rúbriques, us poden ajudar molt a l'hora de programar la solució.
3. Llegiu tots els exercicis abans de començar a programar.
4. Tots els exercicis tenen els mateixos punts. Són 4 cadascun 2.5 punts.

###Exercici 1. Generar travessa.
Heu de realitzar una funció que passada una **matriu** de 15 x 2 us dirà la travessa que s'ha generat. 

La matriu que s'us passa és la dels resultats dels partits. Sent la columna 1 els gols de l'equip local i la columna2 els gols de l'equip visitant.  

Vosaltres per a cada partit heu d'assignar-li:
  - 1 si els gols locals són superiors que els gols visitants
  - X si els gols locals són iguals que els gols visitants
  - 2 si els gols locals són menors que els gols visitants

Per exemple el vostre programa rebria la **matriu** resultats:
```
{{1,2},{2,2},{0,0},{1,0}} 
```
I hauria de crear un array quiniela:
```
{2,X,X,1} 
```

Després pintar per pantalla:

```
QUINIELA
Partit 1 - 2
Partit 2 - X
Partit 3 - X
Partit 4 - 1
```

Aquí teniu el [codi](https://drive.google.com/file/d/0B5xPZvbgiWCkQ0Ewc0pPblZoUEE/view?usp=sharing) per completar.

| Valoració |||||
| ------------- |:-------------:| -----:| -----:| -----:|
| Es compleixen les consideracions de l'examen        | No (0 punts)        | Menys de 3 (0.2 punts)   | Més de 3 (0.4 punts) | Totes (0.6 punts) |
| Nombre de funcions creades       | Cap (0 punts)        | Només 1 (0.2 punts)   | Dues (0.3 punts)  |
| Retorn de les funcions       | No (0 punts)        | void (0.1 punts)   | Tipus adequat (0.3 punts)  |
| Funcionament correcte       | No (0 punts)        | Té molts errors (0.2 punts)   | Pocs errors (0.6 punts) | Perfecte (1 punts) |
| Sortida        | No (0 punts)        | Hi ha algun error (0.1 punts)   | Perfecte (0.3 punts) |


###Exercici 2. Comptar lletres.

Heu de crear una funció que compti els cops que apareix una lletra (A,C,G o T) en una seqüència de ADN. La seqüència de ADN és un array on cada posició contindrà una lletra A o C o G o T. 

Per exemple donat aquest ADN {A,A,A,G,A,A,A,G,T,C,T,G,A,C,T,C,T,G,A,C} i l'usuari vol saber la T el vostre codi ha de dir que apareix  4 vegades.

Aquí teniu el [codi](https://drive.google.com/file/d/0B5xPZvbgiWCkclo5MHl2TFV4bTA/view?usp=sharing) per completar.

| Valoració |||||
| ------------- |:-------------:| -----:| -----:| -----:|
| Es compleixen les consideracions de l'examen        | No (0 punts)        | Menys de 3 (0.1 punts)   | Més de 3 (0.3 punts) | Totes (0.5 punts) |
| Nombre de funcions creades       | Cap (0 punts)        | Només 1 (0.2 punts)   | Dues (0.3 punts)  |
| Retorn de les funcions       | No (0 punts)        | void (0.1 punts)   | Tipus adequat (0.3 punts)  |
| Funcionament correcte       | No (0 punts)        | Té molts errors (0.2 punts)   | Pocs errors (0.6 punts) | Perfecte (1.2 punts) |
| Sortida        | No (0 punts)        | Hi ha algun error (0.1 punts)   | Perfecte (0.5 punts) |
