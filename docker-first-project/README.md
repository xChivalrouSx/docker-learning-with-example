#  docker-first-app
For learning docker basics for spring boot app

---

## Set Docker Config Manually

#### 1. Get mongo image

```shell
docker pull mongo
```

#### 2. Get mongo-express image

```shell
docker pull mongo-express
```

#### 3. Create network for comunication between mongo and mongo-express

```shell
docker network create mongo-network
```

#### 4. Create volume for persistent data

```shell
docker volume create mongodb-volume --opt type=none --opt device=<path-for-volume> --opt o=bind
```

#### 5. Create and run mongodb container

```shell
docker run -d -p 27017:27017 -e MONGO_INITDB_ROOT_USERNAME=<mongo-username> -e MONGO_INITDB_ROOT_PASSWORD=<mongo-password> --name mongodb --net mongo-network -v mongodb-volume:/data/db mongo
```

#### 6. Create and run mongo-express container

```shell
docker run -d -p 8081:8081 -e ME_CONFIG_MONGODB_URL=mongodb://<mongo-username>:<mongo-password>@mongodb:27017 --name mongo-express --net mongo-network mongo-express
```

---

## Create Spring Boot Application Image and Run on Docker

#### 1. Build Dockerfile to creating spring boot application image

```shell
docker build -t spring-boot-first:1.0 <Dockerfile-path>
```

#### 2. Create and run spring boot application container

```shell
docker run --name spring-boot-app -p 9091:9091 --net mongo-network spring-boot-first:1.0
```

---

## Runing System with Docker Compose 

#### 1. Create and run all containers with docker compose

```shell
docker-compose -f docker-compose.yaml up -d
```

#### 2. Stop and remove all containers with docker compose

```shell
docker-compose -f docker-compose.yaml down
```
