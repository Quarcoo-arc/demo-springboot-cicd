# Demo CI/CD with Spring Boot, GitHub Actions & AWS EC2
This is a simple Spring Boot application created to demonstrate how to set up a Continuous Integration and Continuous Deployment (CI/CD) pipeline using [GitHub Actions](https://github.com/features/actions) and [AWS EC2](https://aws.amazon.com/ec2/).

## 📂 Project Structure

```
./
├── .mvn/ # Maven wrapper files
├── .github/workflows/ # GitHub Actions workflows
├── mvnw
├── src/ 
│   ├── main/
│   │   ├── java/
│   │   │   └── org/minoq/demo/
│   │   │       ├── DemoApplication.java          # Spring Boot entry point
│   │   │       └── rest/DemoRestController.java  # REST endpoint
│   │   └── resources/                            # Application resources
│   └── test/                           
├── .gitattributes
├── .gitignore
└── README.md
```

## 🚀 Features
- Spring Boot REST API
- CI/CD Pipeline with GitHub Actions

## 🛠️ Getting Started
Checkout this [article](https://medium.com/@michaelquarcoo04/ci-cd-pipeline-for-spring-boot-applications-github-actions-aws-ec2-pm2-d627a40cbe6e) for detailed instructions on how to configure the AWS EC2 instance, GitHub secrets and set up the application and pipeline.