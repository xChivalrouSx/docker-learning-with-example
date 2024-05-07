#  docker-commands
For learning basic Docker commands

---

## Serve a website with Docker

#### 1. Get nginx image

```shell
docker pull nginx:latest
```

#### 2. Create a container and run

```shell
docker run --name docker-website-test -v <path-of-file-to-serve>:/usr/share/nginx/html:ro -d -p 8080:80 nginx
```

#### 3. Your website should be live in localhost:8080

---

## Some other Docker commands

#### 1. Start existing container

```shell
docker start <id-orname>
```

#### 2. Stop existing container

```shell
docker stop <id-orname>
```

#### 3. Stop existing container

```shell
docker stop <id-orname>
```

#### 4. Remove existing container (`-f`: force)

```shell
docker rm <id-orname>
```
```shell
docker rm -f <id-orname>
```

#### 5. Remove existing image

```shell
docker rmi <id-orname>
```

#### 6. Shows image (`-a`: all - defaults is just running)

```shell
docker ps
```
```shell
docker ps -a
```

#### 7. Connect to container machine with command line (`//bin//bash` for windows)

```shell
docker exec -it <id-or-name> /bin/bash
```

#### 8. Building an image from Dockerfile

```shell
docker build --tag <name>:<tag> <Dockerfile-path>
```

#### 9. Creating network

```shell
docker network create <network-name>
```

#### 10. Show container logs

```shell
docker logs <id-or-name>
```

#### 11. Run docker compose yml file

```shell
docker-compose -f <compose-yml-file-path> up
```

#### 12. Stops docker compose yml file

```shell
docker-compose -f <compose-yml-file> down
```
