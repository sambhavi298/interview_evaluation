// Load candidates
function loadCandidates() {
    fetch("http://localhost:8080/candidate")
        .then(res => res.json())
        .then(data => {
            let list = document.getElementById("candidateList");
            list.innerHTML = "";

            data.forEach(c => {
                let li = document.createElement("li");
                li.textContent = c.firstName + " (" + c.email + ")";

                let delBtn = document.createElement("button");
                delBtn.textContent = "Delete";
                delBtn.className = "delete";
                delBtn.onclick = () => deleteCandidate(c.candidateId);

                li.appendChild(delBtn);
                list.appendChild(li);
            });
        });
}

// Delete candidate
function deleteCandidate(id) {
    fetch("http://localhost:8080/candidate/" + id, {
        method: "DELETE"
    })
        .then(() => {
            loadCandidates();
        });
}

// Add candidate
function addCandidate() {

    const candidate = {
        candidateId: Math.floor(Math.random() * 10000),
        firstName: document.getElementById("firstName").value,
        email: document.getElementById("email").value
    };

    fetch("http://localhost:8080/candidate", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(candidate)
    })
        .then(() => {
            loadCandidates();
        });
}

// Load on start
loadCandidates();
