def call(String url, String branch){
  echo "Code is clonning from github"
  git url: "${url}", branch: "${branch}"
  echo "Code clonned successfully"
}
