#  docker-first-app
For learning basic Docker with basic example app

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