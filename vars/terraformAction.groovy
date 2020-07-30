def terraformAction(String tfAction){
     sh "terraform ${tfAction} $terraform_path/"
}
