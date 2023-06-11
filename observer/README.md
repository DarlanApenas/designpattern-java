<h1>Observer</h1>

O padrão de projeto Observer é um padrão comportamental que permite a comunicação entre objetos de forma desacoplada.
Ele define uma relação de um-para-muitos entre objetos, de modo que quando um objeto (chamado de "sujeito") muda de estado, todos os seus objetos dependentes (chamados de "observadores") são notificados e atualizados automaticamente.

<li> Sujeito (Subject): É o objeto que possui o estado a ser observado.
Ele mantém uma lista de observadores e fornece métodos para adicionar, remover e notificar os observadores quando ocorre uma mudança em seu estado.
<li> Observador (Observer): É a interface que define os métodos de notificação que os observadores devem implementar.
Geralmente, inclui um método como update() que é chamado pelo sujeito para notificar uma mudança.
<li> Observador Concreto (Concrete Observer): É a implementação específica da interface Observador. Cada observador concreto mantém uma referência ao sujeito e implementa a lógica para lidar com as notificações recebidas.

<h3>Benefícios do padrão de projeto Observer</h3>

<li> Desacoplamento entre sujeito e observadores: O sujeito não precisa conhecer os detalhes específicos de seus observadores. Ele apenas notifica uma lista genérica de observadores quando ocorre uma mudança em seu estado.
<li> Extensibilidade: É possível adicionar novos observadores sem modificar o código do sujeito.
<li> Reutilização de código: Os observadores podem ser reutilizados em diferentes contextos, uma vez que não estão fortemente acoplados ao sujeito.
O padrão de projeto Observer é amplamente utilizado em Java e em muitos frameworks e bibliotecas.
Ele oferece uma maneira flexível de implementar comunicação e atualização entre objetos, permitindo que um objeto seja observado por vários outros objetos de forma desacoplada.