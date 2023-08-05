def call(Map scripts=[:]){
    def scriptContents = libraryResource "${scripts}.name"
    writeFile file:"${scripts}.name", text:scriptContents
    sh "chmod a+x ./${scripts}.name"
}
