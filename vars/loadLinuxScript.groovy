def call(Map config=[:]){
    def scriptContents = libraryResource "${config.filename}"
    writeFile file:"${config.filename}", text:scriptContents
    sh "dos2unix ${WORKSPACE}/hello-world.sh"
    sh "chmod +x ./${config.filename}"
}
