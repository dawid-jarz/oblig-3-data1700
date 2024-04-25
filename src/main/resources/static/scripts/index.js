function ticketOrder(){
    const movie = $("#movie").val();
    const name = $("#name").val();
    const sname = $("#sname").val();
    const quantity = $("#quantity").val();
    const email = $("#email").val();
    const nmb = $("#nmb").val();

    if (movie === "" || name === "" || sname === "" || quantity === "" || email === "" || nmb === "") {
        alert("Please fill in all fields.");
        return;
    }

    const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailPattern.test(email)) {
        alert("Please enter a valid email address.");
        return;
    }

    const phoneNumberPattern = /^\d{8}$/;
    if (!phoneNumberPattern.test(nmb)) {
        alert("Phone number must contain exactly 8 digits.");
        return;
    }

    const ticket = {
        movie: movie,
        name: name,
        sname: sname,
        quantity: quantity,
        email: email,
        nmb: nmb
    };

    $.post("/save", ticket, function(){
        getAll();
    });

    $("#movie").val("");
    $("#name").val("");
    $("#sname").val("");
    $("#quantity").val("");
    $("#email").val("");
    $("#nmb").val("");
}

function getAll(){
    $.get("/getAll", function (data){
        clearData(data);
    });
}

function clearData(tickets) {
    let out = "<table><tr><th>Movie</th><th>Name</th><th>Surname</th><th>Quantity</th><th>Email</th><th>Phone Number</th></tr>";
    for (const ticket of tickets) {
        out += `<tr><td>${ticket.movie}</td><td>${ticket.name}</td><td>${ticket.sname}</td><td>${ticket.quantity}</td><td>${ticket.email}</td><td>${ticket.nmb}</td></tr>`;
    }
    out += "</table>";
    $("#orderedTickets").html(out);
}

function deleteTickets(){
    $.get("/deleteAll", function(){
        getAll();
    })
}
