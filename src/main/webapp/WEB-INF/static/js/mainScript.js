$(document).ready(init);

function init() {
    show();
}

function show() {
    var card = $('<div class="card-deck">\n' +
        '        <div class="w-25 p-3">\n' +
        '            <div class="card">\n' +
        '                <img src="/static/mafia.jpg" class="card-img-top" alt="...">\n' +
        '                <div class="card-body">\n' +
        '                    <h5 class="card-title">Card title</h5>\n' +
        '                    <p class="card-text">Some text</p>\n' +
        '                    <p class="card-text">\n' +
        '                        <small class="text-muted">Last updated 3 mins ago</small>\n' +
        '                    </p>\n' +
        '                    <a href="#" class="btn btn-primary">Go somewhere</a>\n' +
        '                </div>\n' +
        '            </div>\n' +
        '        </div>\n' +
        '        <div class="w-25 p-3">\n' +
        '            <div class="card">\n' +
        '                <img src="/static/mafia.jpg" class="card-img-top" alt="...">\n' +
        '                <div class="card-body">\n' +
        '                    <h5 class="card-title">Card title</h5>\n' +
        '                    <p class="card-text">Some text</p>\n' +
        '                    <p class="card-text">\n' +
        '                        <small class="text-muted">Last updated 3 mins ago</small>\n' +
        '                    </p>\n' +
        '                    <a href="#" class="btn btn-primary">Go somewhere</a>\n' +
        '                </div>\n' +
        '            </div>\n' +
        '        </div>\n' +
        '        <div class="w-25 p-3">\n' +
        '            <div class="card">\n' +
        '                <img src="/static/mafia.jpg" class="card-img-top" alt="...">\n' +
        '                <div class="card-body">\n' +
        '                    <h5 class="card-title">Card title</h5>\n' +
        '                    <p class="card-text">Some text</p>\n' +
        '                    <p class="card-text">\n' +
        '                        <small class="text-muted">Last updated 3 mins ago</small>\n' +
        '                    </p>\n' +
        '                    <a href="#" class="btn btn-primary">Go somewhere</a>\n' +
        '                </div>\n' +
        '            </div>\n' +
        '        </div>\n' +
        '        <div class="w-25 p-3">\n' +
        '            <div class="card">\n' +
        '                <img src="/static/mafia.jpg" class="card-img-top" alt="...">\n' +
        '                <div class="card-body">\n' +
        '                    <h5 class="card-title">Card title</h5>\n' +
        '                    <p class="card-text">Some text</p>\n' +
        '                    <p class="card-text">\n' +
        '                        <small class="text-muted">Last updated 3 mins ago</small>\n' +
        '                    </p>\n' +
        '                    <a href="#" class="btn btn-primary">Go somewhere</a>\n' +
        '                </div>\n' +
        '            </div>\n' +
        '        </div>\n' +
        '    </div>');

    $('#main').append(card);
}

function showCategories() {
    var categories = $('<p>some text</p>');

    $('#categories').append(categories);
}