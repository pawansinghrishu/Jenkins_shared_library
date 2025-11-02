def call() {
    sh 'trivy image pawan009/youtube:latest > trivyimage.txt'
}
