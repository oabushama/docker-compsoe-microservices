from flask import Flask
from random import randrange
from flask_cors import CORS, cross_origin

app = Flask(__name__)
ors = CORS(app, resources={r"/*": {"origins": "*"}})

images = ['https://www.ikea.com/sa/en/images/products/friheten-corner-sofa-bed-with-storage-skiftebo-dark-grey__0175610_pe328883_s5.jpg',
        'https://www.ikea.com/sa/en/images/products/vangsta-extendable-table-black-dark-brown__0809397_pe771036_s5.jpg',
        'https://www.ikea.com/sa/en/images/products/hektogram-floor-uplighter-silver-colour-white__0941175_pe795353_s5.jpg',
        'https://www.ikea.com/sa/en/images/products/lack-coffee-table-black-brown__57537_pe163119_s5.jpg',
        'https://www.ikea.com/sa/en/images/products/malm-desk-black-brown__0735973_pe740307_s5.jpg',
        'https://www.ikea.com/us/en/images/products/strandmon-ottoman-kelinge-beige__0950955_pe800834_s5.jpg',
        'https://www.ikea.com/us/en/images/products/tullsta-chair-cover-nordvalla-medium-gray__0386142_pe559174_s5.jpg',
        'https://www.ikea.com/us/en/images/products/billy-bookcase-white__0627027_pe693158_s5.jpg'
        ]
items = ["convertible sofa", "dining table",
        "floor lamp", "coffee table", "desk",
        "Ottoman", "barrel chair", "corner bookcase"]

@app.route("/best-sellers")
@cross_origin()
def best_sellers():
    sellers_list = []
    size = len(items) if len(items)< len(images) else len(images)
    for i, val in enumerate(items[:size]):
        sellers_list.append({"item": val, "price": randrange(300), "image": images[i]})
    return {"items": sellers_list}

if __name__ == "__main__":
    app.run(host="localhost", port=3000)
