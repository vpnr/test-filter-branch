insert into ville (libelle_ville, cp_ville) values ("le plessis robinson", "92350");
insert into ville (libelle_ville, cp_ville) values ("chatenay malabry", "92160");
insert into ville (libelle_ville, cp_ville) values ("bagneux", "92220");
insert into ville (libelle_ville, cp_ville) values ("paris", "75000");
insert into ville (libelle_ville, cp_ville) values ("montrouge", "92140");

insert into fonction (libelle_fonction) values ("secrétaire de syndicat");
insert into fonction (libelle_fonction) values ("trésorier de syndicat");
insert into fonction (libelle_fonction) values ("secrétaire de syndicat adjoint");
insert into fonction (libelle_fonction) values ("trésorier de syndicat adjoint");
insert into fonction (libelle_fonction) values ("archiviste de syndicat");
insert into fonction (libelle_fonction) values ("membre du conseil de syndicat");
insert into fonction (libelle_fonction) values ("membre du bureau de syndicat");
insert into fonction (libelle_fonction) values ("secrétaire de groupement");
insert into fonction (libelle_fonction) values ("trésorier de groupement");
insert into fonction (libelle_fonction) values ("secrétaire de groupement adjoint");
insert into fonction (libelle_fonction) values ("trésorier de groupement adjoint");
insert into fonction (libelle_fonction) values ("archiviste de groupement");
insert into fonction (libelle_fonction) values ("membre du conseil de groupement");
insert into fonction (libelle_fonction) values ("membre du bureau de groupement");
insert into fonction (libelle_fonction) values ("secrétaire de section");
insert into fonction (libelle_fonction) values ("trésorier de section");
insert into fonction (libelle_fonction) values ("secrétaire de section adjoint");
insert into fonction (libelle_fonction) values ("trésorier de section adjoint");
insert into fonction (libelle_fonction) values ("archiviste de section");
insert into fonction (libelle_fonction) values ("membre du conseil de section");
insert into fonction (libelle_fonction) values ("membre du bureau de section");
insert into fonction (libelle_fonction) values ("secrétaire UD");
insert into fonction (libelle_fonction) values ("trésorier UD");
insert into fonction (libelle_fonction) values ("secrétaire UD adjoint");
insert into fonction (libelle_fonction) values ("trésorier UD adjoint");
insert into fonction (libelle_fonction) values ("membre du bureau UD");
insert into fonction (libelle_fonction) values ("membre CA UD");
insert into fonction (libelle_fonction) values ("secrétaire de federation");
insert into fonction (libelle_fonction) values ("trésorier de federation");
insert into fonction (libelle_fonction) values ("secrétaire de federation adjoint");
insert into fonction (libelle_fonction) values ("trésorier de federation adjoint");
insert into fonction (libelle_fonction) values ("membre de la commission exécutive de le federation");
insert into fonction (libelle_fonction) values ("membre du bureau de la fédération");
insert into fonction (libelle_fonction) values ("secrétaire du CE");
insert into fonction (libelle_fonction) values ("trésorier du CE");
insert into fonction (libelle_fonction) values ("secrétaire du CE adjoint");
insert into fonction (libelle_fonction) values ("trésorier du CE adjoint");
insert into fonction (libelle_fonction) values ("secrétaire du CHSCT");
insert into fonction (libelle_fonction) values ("délégué syndical");
insert into fonction (libelle_fonction) values ("représentant syndical au CE");
insert into fonction (libelle_fonction) values ("représentant syndical au CHSCT");
insert into fonction (libelle_fonction) values ("membre du CE");
insert into fonction (libelle_fonction) values ("membre du CE suppléant");
insert into fonction (libelle_fonction) values ("membre du CHSCT");
insert into fonction (libelle_fonction) values ("délégué du personnel");
insert into fonction (libelle_fonction) values ("délégué du personnel suppléant");
insert into fonction (libelle_fonction) values ("représentant syndical central");
insert into fonction (libelle_fonction) values ("délégué syndical central");
insert into fonction (libelle_fonction) values ("secrétaire de branche");
insert into fonction (libelle_fonction) values ("membre CPNEFP");

insert into federation (libelle_federation, numero_rue, libelle_rue, tel_federation, fax_federation, mail_federation, id_ville_federation) values("FO Pharmacie", "7", "passage tenaille", "0140528560", "0140528561", "fopharma@wanadoo.fr", 1);
insert into federation (libelle_federation, numero_rue, libelle_rue, tel_federation, fax_federation, mail_federation, id_ville_federation) values("FO batiment", "102", "micile fix", "0145854525", "0146525412", "fochantier@gmail.fr", 2);
insert into federation (libelle_federation, numero_rue, libelle_rue, tel_federation, fax_federation, mail_federation, id_ville_federation) values("FO Cheminot", "4", "allee de la boissiere", "0145854578", "0143621549", "focheminot@wanadoo.fr", 3);
insert into federation (libelle_federation, numero_rue, libelle_rue, tel_federation, fax_federation, mail_federation, id_ville_federation) values("FO Textile", "12", "impasse de la raie", "0196989591", "0121545487", "foapoil@wanadoo.fr", 2);

insert into branche (libelle_branche, id_federation_branche) values ("Construction", 2);
insert into branche (libelle_branche, id_federation_branche) values ("Labo", 1);
insert into branche (libelle_branche, id_federation_branche) values ("Officine", 1);
insert into branche (libelle_branche, id_federation_branche) values ("Livreur", 1);

insert into ud (libelle_ud, numero_rue, libelle_rue, tel_ud, fax_ud, mail_ud, siteweb_ud, id_ville_ud) values ("ud78", "5", "rue de verdun", "0145454542", "0145785221", "ud78@yahoo.fr", null, 1);
insert into ud (libelle_ud, numero_rue, libelle_rue, tel_ud, fax_ud, mail_ud, siteweb_ud, id_ville_ud) values ("ud85", "1", "rue de tunis", "0145877896", "0215469632", "ud85@yahoo.fr", null, 2);
insert into ud (libelle_ud, numero_rue, libelle_rue, tel_ud, fax_ud, mail_ud, siteweb_ud, id_ville_ud) values ("ud92", "9", "boulevard voltaire", "0149969696", "0145656985", "ud92@yahoo.fr", null, 1);
insert into ud (libelle_ud, numero_rue, libelle_rue, tel_ud, fax_ud, mail_ud, siteweb_ud, id_ville_ud) values ("ud12", "77", "rue de la liberte", "0836656565", "0145487878", "ud12@yahoo.fr", null, 3);

insert into entreprise (libelle_entreprise, numero_rue, libelle_rue, tel_entreprise, fax_entreprise, mail_entreprise, date_election, id_ville_entreprise) values ("OCP", "5", "avenue galile", "0150454210", "0150421050", "ocp@gmail.com", "2016-01-16", 1);
insert into entreprise (libelle_entreprise, numero_rue, libelle_rue, tel_entreprise, fax_entreprise, mail_entreprise, date_election, id_ville_entreprise) values ("Afcepf", "3", "rue danton", "0112455201", "0145523550", "afcepf@afcepf.fr", "2016-11-15", 1);
insert into entreprise (libelle_entreprise, numero_rue, libelle_rue, tel_entreprise, fax_entreprise, mail_entreprise, date_election, id_ville_entreprise) values ("A2RT", "22", "avenue aristid briand", "0145401010", "0145478585", "a2rt@msn.com", "2016-12-10", 3);
insert into entreprise (libelle_entreprise, numero_rue, libelle_rue, tel_entreprise, fax_entreprise, mail_entreprise, date_election, id_ville_entreprise) values ("Cerp", "12", "avenue du general de gaule", "0145454545", "0145454546", "lacerp@gmail.com", "2016-02-23", 2);

insert into syndicat (libelle_syndicat, numero_rue, libelle_rue, tel_syndicat, fax_syndicat, mail_syndicat, dernier_ag, prochain_ag, id_ville_syndicat, id_federation_syndicat, id_branche_syndicat, id_ud_syndicat) values ("FO78",  "78", "rue du moulin", "0145859696", "0112131313", "fo@gmail.com", "2016-02-23", "2017-02-23", 4, 2, 1, 1);
insert into syndicat (libelle_syndicat, numero_rue, libelle_rue, tel_syndicat, fax_syndicat, mail_syndicat, dernier_ag, prochain_ag, id_ville_syndicat, id_federation_syndicat, id_branche_syndicat, id_ud_syndicat) values ("CGT92",  "10", "rue marcel samba", "0145487854", "0146305050", "cgt@yahoo.fr", "2016-05-02", "2017-05-12", 2, 2, 1, 2);
insert into syndicat (libelle_syndicat, numero_rue, libelle_rue, tel_syndicat, fax_syndicat, mail_syndicat, dernier_ag, prochain_ag, id_ville_syndicat, id_federation_syndicat, id_branche_syndicat, id_ud_syndicat) values ("CGT78",  "7", "villa lamarre", "0132151749", "0124545201", "lagoute@hotmail.fr", "2016-04-10", "2017-04-11", 1, 1, 2, 2);
insert into syndicat (libelle_syndicat, numero_rue, libelle_rue, tel_syndicat, fax_syndicat, mail_syndicat, dernier_ag, prochain_ag, id_ville_syndicat, id_federation_syndicat, id_branche_syndicat, id_ud_syndicat) values ("FO92",  "9", "rue du moulin", "0645487852", "0145784852", "fo@gmail.com", "2016-11-10", "2017-11-01", 3, 1, 2, 3);

insert into adherent(nom_adherent, prenom_adherent, dob_adherent, numero_rue, libelle_rue, tel_adherent, mail_adherent, id_ville_adherent, id_entreprise_adherent, id_syndicat_adherent) values ("Pannier", "Vincent", "1989-06-23", "14", "rue fernand fourcade", "0669391170", "vi.pannier@gmail.com", 1,1,1);
insert into adherent(nom_adherent, prenom_adherent, dob_adherent, numero_rue, libelle_rue, tel_adherent, mail_adherent, id_ville_adherent, id_entreprise_adherent, id_syndicat_adherent) values ("Bouchet", "Messaline", "1991-10-11", "6", "mat laurent", "06645549965", "messbou@gmail.com", 2,2,2);
insert into adherent(nom_adherent, prenom_adherent, dob_adherent, numero_rue, libelle_rue, tel_adherent, mail_adherent, id_ville_adherent, id_entreprise_adherent, id_syndicat_adherent) values ("Pannier", "Philippe", "1965-12-04", "14", "rue du capitaine facq", "0685810505", "phil.pannier@msn.com", 3, 1, 4);
insert into adherent(nom_adherent, prenom_adherent, dob_adherent, numero_rue, libelle_rue, tel_adherent, mail_adherent, id_ville_adherent, id_entreprise_adherent, id_syndicat_adherent) values ("Pannier", "Veronique", "1964-12-18", "14", "rue A", "0688447250", "lagoute92@hotmail.com", 4, 2, 3);

