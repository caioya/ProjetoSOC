#language:pt

Funcionalidade: Buscar credenciado no blog
	Eu como um usuário do blog do Software Integrado de Gestão Ocupacional
	quero buscar credenciado na plataforma
	para visualizar seu perfil
	
	Cenário: Realizar busca de credenciado no blog
		Dado que estou na página do blog de saúde e segurança do trabalho
		Quando acesso a funcionalidade Rede SOCNET
		E acesso buscar credenciados
		E preencho os filtros de busca
		E seleciono o credenciado desejado
		Então visualizo o perfil do credenciado