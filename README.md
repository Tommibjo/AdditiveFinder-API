# AdditiveFinder-API (Java Spring Boot RESTful api)

Spring boot RESTful service. 
Pystyy vastaanottamaan ja lähettämään JSON dataa (HTTP Metodien avulla). 
Käyttää Spring CrudRepository:ä MYSQL tietokannan datan käsittelyyn.

Tarkoituksena luoda vielä API:n selainpohjaiseen käytötliittymään mahdollisuus lisätä yksittäisiä lisäaine "vastaavuuksia" haluttaessa. Todennäköisesti lisään vielä vastaavanlaisen toiminnon itse AdditiveFinder Android sovellukseen.  Tällä hetkellä työn alla on kuitenkin ominaisuus, jonka avulla "vastaavuudet voidaan ajaa massa-ajona MySQL tietokantaan, excel tiedostosta: 

![alt text](https://i.imgur.com/eP7zMsM.png)
- Tämä sen vuoksi, että saan MySQL tietokannan täytettyä helposti. Vastaavuuksia on useita.


"Vastaavuudella" tarkoitan yhtä Json objectia, joka sisältää Elgan tuotenimikkeen nimen ja kilpailijan nimen.
Tietokanta on lähes tyhjä vastaavuuksista, mikäli testidataa ei lasketa. 
Esimerkki tietokannasta tällä hetkellä löytyvistä "vastaavuuksista":

![alt text](https://i.imgur.com/MHSGBzN.png)


