# AdditiveFinder-API (Java Spring Boot RESTful api)

Spring boot RESTful service. 
Pystyy vastaanottamaan ja lähettämään JSON dataa (HTTP Metodien avulla). 
Käyttää Spring CrudRepository:ä MYSQL tietokannan datan käsittelyyn.

Tällä hetkellä työn alla ominaisuus, jonka avulla "vastaavuudet" voitaisiin ajaa MySQL tietokantaan, excel tiedostosta. 

![alt text](https://i.imgur.com/eP7zMsM.png)

"Vastaavuudella" tarkoitan yhtä Json objectia, joka sisältää Elgan tuotenimikkeen nimen ja kilpailijan nimen.
Tietokanta on lähes tyhjä vastaavuuksista, mikäli testidataa ei lasketa. 
Esimerkki tietokannasta tällä hetkellä löytyvistä "vastaavuuksista":

![alt text](https://i.imgur.com/MHSGBzN.png)


Tarkoituksena vielä luoda API:lle erillinen käyttöliittymä, jonka avulla tietokantaan voidaan lisätä lisäaine vastaavuuksia haluttaessa. Todennäköisesti lisään vastaavanlaisen toiminnon itse AdditiveFinder Android sovellukseen. 
