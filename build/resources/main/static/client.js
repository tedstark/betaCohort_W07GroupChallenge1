function goToUserInfo() {
    var searchString = $("#inputName").val();
    window.location.href="/user/" + searchString;
}
function goToAllUsers() {
    window.location.href="/allusers";
}
function goHome() {
    window.location.href="/";
}
