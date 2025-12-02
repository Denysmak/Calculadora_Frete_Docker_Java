#Imagem base do java
FROM amazoncorretto:17

# Pasta de trabalho dentro do Container
WORKDIR /app

#Copia TUDO da raiz do projeto para o container
COPY . /app

#Compila todos os arquivos Java que estão DENTRO da pasta src
RUN javac src/*.java

#Roda o Main. O "-cp src" diz para o java procurar as classes na pasta src
CMD ["java", "-cp", "src", "Main"]



