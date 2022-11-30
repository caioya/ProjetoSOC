#language:pt

Funcionalidade: Buscar no blog
	Eu como um usuário do blog do Software Integrado de Gestão Ocupacional
	quero buscar alguma informação na plataforma
	para tirar realizar uma pesquisa
	
	Esquema do Cenário: Realizar busca no blog
		Dado que estou na página do blog de saúde e segurança do trabalho
		Quando digito a informação <info> a ser procurada na barra de pesquisa
		E envio a solicitação da pesquisa
		Então recebo e verifico o resultado com as informações buscadas
	 
		Exemplos:
		| info |
		| sustentabilidade |
		| conhecimento |