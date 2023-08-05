def call(Map scripts=[:]){
    def scriptContents = libraryResource "${scripts}.filename"
    writeFile file:"${scripts}.filename", text:scriptContents
    sh "chmod a+x ./${scripts}.filename"
}
