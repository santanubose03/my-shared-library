def call(Map config=[:]){
    def scriptContents = libraryResource "${config.filename}"
    writeFile file:"${config.filename}", text:scriptContents
    sh "chmod +x ./${config.filename}"
}
