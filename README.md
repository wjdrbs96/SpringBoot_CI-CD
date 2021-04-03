# `Spring Boot로 CI/CD 파이프라인 구축하기`

![ar](https://t1.daumcdn.net/cfile/tistory/996F763D5A73F91E26)

- 현재 아키텍쳐는 위와 같음(`Nginx`는 하는 중..)

<br>

## `사용된 도구`

- `Spring Boot`
- `Travis CI`
- `AWS EC2`
- `AWS CodeDeloy`
- `AWS S3`
- `Docker`
- `Github`

<br> <br>

## `EC2 Linux2에 Nginx 설치`

```
sudo amazon-linux-extras install -y nginx1 
nginx -v  (설치 확인)
sudo service nginx start (nginx 시작)
```

<br>

## `Nginx와 Spring Boot 연동하기`

```
sudo vim /etc/nginx/nginx.conf
```

![스크린샷 2021-03-25 오후 1 53 12](https://user-images.githubusercontent.com/45676906/112420961-83622400-8d71-11eb-89c2-181aa636016c.png)

```
proxy_pass http://EC2-IP:8080;
proxy_set_header X-Real-IP $remote_addr;
proxy_set_header X-Forwarder-For $proxy_add_x_forwarded_for;
proxy_set_header Host $http_host;
```

```
sudo service nginx restart (nginx 재시작)
```

그리고 `http://EC2-IP`으로 들어가면 `http://EC2-IP:8080`으로 프록시 하는 것을 볼 수 있다.
