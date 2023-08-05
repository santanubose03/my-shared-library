def call(Map scripts=[:]){
    sh "echo entered loadlinuxscript file"
    def scriptContents = libraryResource "${scripts.filename}"
    writeFile file:"${scripts.filename}", text:scriptContents
    sh "chmod a+x ./${scripts.filename}"
}
