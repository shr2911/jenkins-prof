def terraformAction(String tfAction){
    if (tfAction == "init") {
     echo "Hello World"
     sh "terraform ${tfAction} $terraform_path/"
    } else {
     sh "terraform ${tfAction} $terraform_path/"
    }
}
