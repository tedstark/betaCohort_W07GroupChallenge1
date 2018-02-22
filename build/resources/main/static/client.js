function goToUserInfo() {
    var searchString = $("#inputName").val();
    window.location.href="/user/" + searchString;
    console.log("User Page Ready")
}
function goToAllUsers() {
    window.location.href="/allusers";
    console.log("All Users Page Ready")
}
function goHome() {
    window.location.href="/";
    console.log("Home Page Ready")
}