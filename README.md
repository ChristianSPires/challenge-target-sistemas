# Respostas para o Desafio da Target Sistemas

## Resposta 1: 91

## [Resposta 2](https://github.com/ChristianSPires/challenge-target-sistemas/blob/main/Fibonacci.java)

## Resposta 3: 

### 3a = 9
### 3b = 128
### 3c = 49
### 3d = 100
### 3e = 13
### 3f = 200

## Resposta 4:  

### 1 Passo: Ligar um interruptor e aguardar cerca de 15 minutos.
### 2 Passo: Deixar um interruptor desligado, desligar o interruptor que ficou ligado por 10 minutos e ligar o outro quando sair da sala.

#### Esquema de interruptores:

##### Interruptor 1 - [off]
##### Interruptor 2 - [ligado por 10 minutos e desligado ao sair da sala]
##### Interruptor 3 - [ligado na saída da sala]

### 3 Passo: Ir para uma sala

#### Caso 3.1: Se a luz estiver desligada, tocamos na lâmpada para saber se a mesma está quente ou fria. Caso esteja quente, está sala está conectada no interruptor 2. Caso esteja fria, está conectada no interruptor 1.

#### Caso 3.2: Se a luz estiver ligada, a sala está conectada no interruptor 3.

### 4 Passo de acordo com o Caso 3.1

#### 4.1: Ir para a proxima sala de lâmpadas. Pressupondo que a primeira sala que visitamos a lâmpada estava quente, caso a lâmpada esteja apagada na segunda sala, esta sala está conectada ao interruptor 1 que nunca foi ligado e a última sala ao interruptor 3 que permaneceu ligado.
#### 4.2: Ir para a proxima sala de lâmpadas. Pressupondo que a primeira sala que visitamos a lâmpada estava quente, caso a lâmpada esteja acessa na segunda sala, esta sala está conectada ao interruptor 3 que que permaneceu ligado e a última sala ao interruptor 1 que que nunca foi ligado.
#### 4.3: Ir para a proxima sala de lâmpadas. Pressupondo que a primeira sala que visitamos a lâmpada estava fria, caso a lâmpada esteja apagada na segunda sala, esta sala está conectada ao interruptor 2 que foi desligado ao sairmos da sala de interruptores e a última sala está conectada ao interruptor 3 que permaneceu ligado.
#### 4.4: Ir para a proxima sala de lâmpadas. Pressupondo que a primeira sala que visitamos a lâmpada estava fria, caso a lâmpada esteja acessa na segunda sala, esta sala está conectada ao interruptor 3 que permaneceu ligado e a última sala está conectada ao interruptor 2 que foi desligado ao sairmos da sala de interruptores.

### 4 Passo de acordo com o Caso 3.2

#### 4.1: Ir para a proximo sala de lâmpadas. Caso a lâmpada esteja quente, a sala está conectada no interruptor 2 que foi desligado e a última sala está conectada ao interruptor 1 que nunca foi ligado.
#### 4.2: Ir para a proximo sala de lâmpadas. Caso a lâmpada esteja fria, a sala está conectada no interruptor 1 que nunca foi ligado e a última sala está conectada ao interruptor 2 que foi desligado.

## [Resposta 5](https://github.com/ChristianSPires/challenge-target-sistemas/blob/main/StringReversor.java)
