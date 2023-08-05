def call(Map stringParams){
  sh "echo Hello ${stringParams.name}, Today is ${stringParams.dayOfWeek}"
}
