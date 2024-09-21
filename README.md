## PATRÓN DE DISEÑO : OBSERVER 

La clase Stock tiene dos atributos: agentWarning y agentLog.

Se define la inferfaz Agent que es implementada por las dos anteriores clases. 
Tanto agentWarning y agentLog implmentan el método alert() para realizar la respectiva notificación en stdout.


## endpoint REST
Se define la clase StockRepository para manejar la implementación del código asociado a los métodos GET, POST, PATCH, PUT, DELETE
En la clase StockService se maneja la inyección de dependencias, delegando las implementaciones al repositorio. Esta corresponde al controlador.

## Resultados pruebas de unidad luego de Implementación

![image](https://github.com/user-attachments/assets/b3fa8ac1-5e5e-495b-98a6-a7ab8867cf72)

