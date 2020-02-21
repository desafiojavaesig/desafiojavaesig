Or create a new repository on the command line<br /><br />

echo "# acsiu-front-end" >> README.md<br />
git init<br />
git commit -m "first commit"<br />
git remote add origin https://github.com/desafiojavaesig/desafiojavaesig.git<br />
git push -u origin master<br /><br />

Or push an existing repository from the command line<br /><br />
git remote add origin https://github.com/desafiojavaesig/desafiojavaesig.git<br />
git push -u origin master<br /><br />

-------------------------------------------------------------------------------------------------------------------------<br /><br />
Seguem os itens não implentados:<br /><br />
* Para compensar alguns dos itens <C,E,H,I,J,K>

Seguem os itens implementados:<br /><br />
A. Criado uma aplicação java web utilizando JavaServer Faces (JSF)<br />
B. Utilizado persistência em um banco de dados (SQL Server)<br />
D. Utilizado Spring Framework Boot 2.0<br />
F. Utilizado Bootstrap 4<br />
G. Utilizado Primefaces<br /><br />

Implementado <flyway, lombok><br />
Flyway é uma dentre as várias ferramentas que se propõem a trazer ordem e organização para os scripts SQL<br />
que são executados no banco de dados, funcionando como um controle de versão do mesmo.<br /><br />

Uma ferramenta como esta permite:<br /><br />

Sincronizar o banco de dados com a versão da aplicação;<br />
Saber quais scripts SQL foram executados ou não;<br />
Automatizar a execução dos scripts;<br />
Criar um banco de dados do zero;<br />
Permite criar um rollback de mudanças no banco de dados (útil em casos raros).<br /><br />

O Lombok é uma biblioteca Java focada em produtividade e redução de código que por meio de anotações<br />
adicionadas ao nosso código ensinamos o compilador (maven ou gradle) durante o processo de compilação a criar código Java.<br />

