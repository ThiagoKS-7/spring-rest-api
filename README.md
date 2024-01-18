<p align="center">
  <a href="" rel="noopener">
 <img height=200px src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT6w_OjuEd4VB9o-L7FtGwra0GRTDhTdnpLoKrHbaojQT_Mhtb8vyEJl5i_FRbbeU47UWc&usqp=CAU" alt="Project logo"></a>
</p>

<h3 align="center">Spring boot REST API POC</h3>

<div align="center">

[![Status](https://img.shields.io/badge/status-active-success.svg)]()
[![GitHub Issues](https://img.shields.io/github/issues/ThiagoKS-7/spring-rest-api.svg)](https://github.com/ThiagoKS-7/spring-rest-api/issues)
[![GitHub Pull Requests](https://img.shields.io/github/issues-pr/ThiagoKS-7/spring-rest-api.svg)](https://github.com/ThiagoKS-7/spring-rest-api/pulls)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](/LICENSE)

</div>

---

<p align="center"> Spring boot rest api example for praticing
    <br> 
</p>

## 📝 Table of Contents

- [About](#about)
- [Getting Started](#getting_started)
- [Deployment](#deployment)
- [Usage](#usage)
- [Built Using](#built_using)
- [TODO](../TODO.md)
- [Contributing](../CONTRIBUTING.md)
- [Authors](#authors)
- [Acknowledgments](#acknowledgement)

## 🧐 About <a name = "about"></a>

This is a spring-boot REST API proof of concept following linkedin learning's "learning spring with spring boot" topic, that can be found on https://www.linkedin.com/learning/learning-spring-with-spring-boot-13886371/using-a-remote-database?contextUrn=urn%3Ali%3AlyndaLearningPath%3A632a3d5c498e4826a1dcb65e&resume=false

## 🏁 Getting Started <a name = "getting_started"></a>

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See [deployment](#deployment) for notes on how to deploy the project on a live system.

### Prerequisites installation

- JDK 17+ https://docs.docker.com/engine/install/ubuntu/
- Postgres - https://www.digitalocean.com/community/tutorials/how-to-install-postgresql-on-ubuntu-22-04-quickstart
- Docker - https://docs.docker.com/engine/install/ubuntu/
- Maven - sudo apt install maven


## 🎈 Usage <a name="usage"></a>


First, configure postgres docker container by running the following on project root:

```
chmod 777 ./src/main/resources/start_postgres.sh && sudo ./src/main/resources/start_postgres.sh
```

After that, start the tomcat server

```
mvn spring-boot:run
```

## ⛏️ Built Using <a name = "built_using"></a>

- [Spring-boot](https://www.mongodb.com/) - Server Framework
- [PostgreSQL](https://www.postgresql.org) - Database
- [Docker](https://www.docker.com) - Containerization

## ✍️ Authors <a name = "authors"></a>

- [@ThiagoKS-7](https://github.com/ThiagoKS-7) - Initial work

See also the list of [contributors](https://github.com/ThiagoKS-7/spring-rest-api/contributors) who participated in this project.

## 🎉 Acknowledgements <a name = "acknowledgement"></a>

- Reference: https://www.linkedin.com/learning/learning-spring-with-spring-boot-13886371
