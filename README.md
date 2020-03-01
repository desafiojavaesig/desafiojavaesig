Obsrvação foi utilizado o < spring boot com jsf > para o desenvolvimento<br />

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
1) No item 1 foi desenvolvido um CRUD para cadastro de contato<br /> com alguns campos necessário para criação do mesmo.<br />
Seguem os itens não implentados:<br />
Para compensar alguns dos itens <E,H,I,J,K><br />

Seguem os itens implementados:<br />
A. Criado uma aplicação java web utilizando JavaServer Faces (JSF)<br />
B. Utilizado persistência em um banco de dados (SQL Server)<br />
C. JPA<br />
D. Utilizado Spring Framework Boot 2.0<br />
F. Utilizado Bootstrap 4<br />
G. Utilizado Primefaces<br /><br />

Implementado <flyway, lombok><br />
Flyway é uma dentre as várias ferramentas que se propõem a trazer ordem e organização para os scripts SQL<br />
que são executados no banco de dados, funcionando como um controle de versão do mesmo.<br /><br />

Uma ferramenta como esta permite:<br />

Sincronizar o banco de dados com a versão da aplicação;<br />
Saber quais scripts SQL foram executados ou não;<br />
Automatizar a execução dos scripts;<br />
Criar um banco de dados do zero;<br />
Permite criar um rollback de mudanças no banco de dados (útil em casos raros).<br /><br />

O Lombok é uma biblioteca Java focada em produtividade e redução de código que por meio de anotações<br />
adicionadas ao nosso código ensinamos o compilador (maven ou gradle) durante o processo de compilação a criar código Java.<br />

Criar um banco de dados no SQL Server com nome <Acsiu>, usuario: sa, senha: 123456, caso seja criado outro banco,usuario,senha<br />
informar no arquivo <application.properties> que se encontra em scr/main/resources<br />

Executar a aplicação java -jar Desafiojava.jar no prompt de comando, depois de carregado a aplicação<br />
Deve ir ao browser e digitar: http://localhost:8082/index.xhtml<br />

1º.Logo depois exibirá uma tela com menus: INICIO / CADASTRO<br />
a)Ao clicar no menu Cadastro será exibida tela com 2(dois) botões <Pesquisa e Contato><br/><br />
b)Ao clicar no botão Contato será exibida uma tela que deve <preencher nome, cpf e selecionar uf>.<br />
c)Deve clicar no botão <Salvar> para registrar contato<br />
d)Quando clicado no botao <salvar>, será redirecionado para tela de pesquisa.<br />
e)Caso queira fazer um novo cadasto, basta clicar no botão <novo>.<br />
f)para pequisar basta clicar no 1º) Cadastro -> Pesquisa)<br />
g)Deve preencher o nome <nome completo ou parcial> ou cpf<informar o cpf completo> para que possa ser retornado os contatos<br />
h)Para remover basta clicar no botão <Remover> na lista de contato<br />
i)para alterar basta clicar no botão <Alterar> na lista de contato que será redirecionado para a tela de modo de edião,<br />
você informará os dados se necessário e clicar no botão <Salvar>.<br />




