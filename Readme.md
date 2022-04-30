# POC holiday app #
Pour illustrer les concepts de design d'applications et 
en utilisant spring boot.

## installation #
Clone le repository.

Démarre ton IDE préféré. 
Il devrait reconnaître un projet java maven et
télécharger les librairies, soit patient (quelques minutes?).

Sélectionne la classe principale "HolidayApplication" et démarre là.
L'IDE compile et démarre le projet.

Utilise le browser sur http://localhost:8080.


## DB seed ##
Pour insérer un enregistrement dans la table Day_Off,
ouvre la console h2 disponible sur http://localhost/h2-console
et exécute la commande

```roomsql
INSERT INTO DAY_OFF (id, start, end, category, status) VALUES (1, '1/5/2022', '30/5/2022', 'congé annuel', 'REQUESTED');
```
