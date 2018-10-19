# challenge-ns2


### Challenge 1
### Requirements
    - Docker
    - Java 8
    - Postman
### Deployment

Depois de instalar os "Requeriments" entre na pasta do projeto e execute os seguinte comando.
```sh
$ docker run -it -d -p 27017:27017 mongo
```
and ruuning application Java

## Tests routes API via Postman
APIs endpoints

GET http://localhost:8080/api/clientes [lista todos os clientes]

GET http://localhost:8080/api/clientes/{id} [lista um cliente por ID]

POST http://localhost:8080/api/clientes [cadastra um novo cliente]

PUT http://localhost:8080/api/clientes{id} [atualiza os dados de um cliente]

DELETE http://localhost:8080/api/clientes/{id} [remove um cliente por ID]

### Challenge 2
```Java
import java.util.Scanner;

public class Telefone {

    public static void main(String[] args) {


        System.out.println("Digite seu telefone.");
        Scanner scanner = new Scanner(System.in);

        String TEL = scanner.next();

        scanner.close();

        System.out.println("Seu telefone: " + "(" + TEL.substring(0, 2) + ")" + TEL.substring(2, 7) + "-" + TEL.substring(7, 11));
    }
}
```
### Challenge 3

```
SELECT DESC_PRODUTO, COUNT(*) QUANTIDADE FROM #ITENS_PEDIDOS_TESTE A
INNER JOIN #PEDIDOSTESTE B ON A.COD_PEDIDO = B.COD_PEDIDO 
GROUP BY DESC_PRODUTO HAVING COUNT(*) > 1
```

### Challenge 4

```js
db.produto.find({"descricao": {$regex: /Alemanha/}})
```
