const button = document.getElementById("light");

function updateButton(url) {
    fetch(url)
        .then(function(response) {
            return response.text();
        })
        .then(function(textFromJava) {
            console.log(textFromJava);
            button.className = "btn " + textFromJava;
        });
}

let timer = setInterval(function() {
    updateButton("/change-color");
}, 10000);

function triggerChange() {
    updateButton("/change-color");
    clearInterval(timer);
    let timer = setInterval(function() {
        updateButton("/change-color");
    }, 10000);
}

button.addEventListener("click", triggerChange);

updateButton("/reset");