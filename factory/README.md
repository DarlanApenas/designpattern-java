<h1>Factory</h1>

O padrão de projeto Factory é um dos padrões de criação, que lida com a criação de objetos.
Ele fornece uma abordagem para encapsular a lógica de criação de objetos, permitindo que a classe cliente se concentre apenas no uso desses objetos, sem se preocupar com os detalhes de como eles são criados.
O Factory Method define um método em uma classe abstrata (ou interface) que é responsável por criar objetos de uma classe concreta.
A classe cliente chama esse método para obter uma instância do objeto desejado, em vez de criar o objeto diretamente usando o operador "new".

<h2>Abstract Factory</h2>

o Abstract Factory é outro padrão de projeto de criação que fornece uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.
Ele permite que você crie objetos de diferentes tipos, mas relacionados, garantindo que esses objetos sejam compatíveis entre si.
O Abstract Factory define uma interface que declara métodos para criar cada tipo de objeto relacionado.
As subclasses concretas implementam essa interface para fornecer a implementação real desses métodos, criando objetos de classes concretas correspondentes.

<h3>Diferença Factory X Abstract</h3>

A diferença fundamental entre o Factory Method e o Abstract Factory é o escopo da criação de objetos.
O Factory Method lida com a criação de um único tipo de objeto, enquanto o Abstract Factory lida com a criação de famílias de objetos relacionados.
Enquanto o Factory Method permite que uma subclasse decida qual classe concreta criar, o Abstract Factory delega a criação de objetos para subclasses concretas especializadas.

Resumindo, o Factory Method é focado na criação de um único tipo de objeto, enquanto o Abstract Factory é usado quando há famílias de objetos relacionados que precisam ser criados.
