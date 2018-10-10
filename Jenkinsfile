pipeline {
    agent any
    stages{
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
    }

    // // Pree Section 6 Docker Shit
    // agent any

    // parameters {
    //     string(name: 'tomcat_dev', defaultValue: 'localhost', description: 'Staging Server')
    //     string(name: 'tomcat_prod', defaultValue: 'localhost', description: 'Production Server')

    //     // Original
    //     //string(name: 'tomcat_dev', defaultValue: '18.222.190.136', description: 'Staging Server')
    //     //string(name: 'tomcat_prod', defaultValue: '18.191.62.30', description: 'Production Server')
    // }

    // triggers {
    //      pollSCM('* * * * *')
    //  }

    // stages{
    //     stage('Build') {
    //         steps {
    //             sh 'mvn clean package'
    //             //bat 'mvn clean package'
    //         }
    //         post {
    //             success {
    //                 echo 'Now Archiving...'
    //                 archiveArtifacts artifacts: '**/target/*.war'
    //             }
    //         }
    //     }

    //     stage ('Deployments') {
    //         parallel {
    //             stage ('Deploy to Staging'){
    //                 steps {
    //                     sh "cp **/target/*.war /c/Users/496117/Documents/Tomcat/apache-tomcat-8.5.34/apache-tomcat-8.5.34-staging/webapps"
                        
    //                     //sh "scp -i /c/Users/496117/Downloads/tomcat-udemy-jenkins.pem **/target/*.war ec2-user@${params.tomcat_dev}:/var/lib/tomcat8/webapps"

    //                     //sh "scp -i C:\\Users\\496117\\Downloads\\tomcat-udemy-jenkins.pem **/target/*.war ec2-user@${params.tomcat_dev}:/var/lib/tomcat8/webapps"
    //                     //bat "winscp -i C:\\Users\\496117\\Downloads\\tomcat-udemy-jenkins.pem **/target/*.war ec2-user@${params.tomcat_dev}:/var/lib/tomcat8/webapps"

    //                     // Original
    //                     //sh "scp -i /home/jenkins/tomcat-demo.pem **/target/*.war ec2-user@${params.tomcat_dev}:/var/lib/tomcat7/webapps"
    //                     //bat "scp -i /home/jenkins/tomcat-demo.pem **/target/*.war ec2-user@${params.tomcat_dev}:/var/lib/tomcat7/webapps"
    //                 }
    //             }

    //             stage ("Deploy to Production") {
    //                 steps {
    //                     sh "cp **/target/*.war /c/Users/496117/Documents/Tomcat/apache-tomcat-8.5.34/apache-tomcat-8.5.34-prod/webapps"

    //                     //sh "scp -i /c/Users/496117/Downloads/tomcat-udemy-jenkins.pem **/target/*.war ec2-user@${params.tomcat_prod}:/var/lib/tomcat8/webapps"

    //                     //sh "scp -i C:\\Users\\496117\\Downloads\\tomcat-udemy-jenkins.pem **/target/*.war ec2-user@${params.tomcat_prod}:/var/lib/tomcat8/webapps"
    //                     //bat "winscp -i C:\\Users\\496117\\Downloads\\tomcat-udemy-jenkins.pem **/target/*.war ec2-user@${params.tomcat_prod}:/var/lib/tomcat8/webapps"

    //                     // Original
    //                     //sh "scp -i /home/jenkins/tomcat-demo.pem **/target/*.war ec2-user@${params.tomcat_prod}:/var/lib/tomcat7/webapps"
    //                     //bat "scp -i /home/jenkins/tomcat-demo.pem **/target/*.war ec2-user@${params.tomcat_prod}:/var/lib/tomcat7/webapps"
    //                 }
    //             }
    //         }
    //     }
    // }
}