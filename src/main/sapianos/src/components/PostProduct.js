import React from 'react'
import {Card,Form,Col,Button} from "react-bootstrap";
import axios from 'axios';

class PostProduct extends  React.Component{

    constructor(props) {
        super(props);
        this.state = this.initialState
        this.productChange = this.productChange.bind(this);
        this.submitProduct = this.submitProduct.bind(this);
    }

    initialState = {productName:'',price:'',delivery:'',productTimeDD:'',productTimeMM:'',productTimeYYYY:'',cook:'',
        descriere:''}

     submitProduct = event => {
         event.preventDefault();
         const product = {
             product: this.state.name,
             price: this.state.price,
             delivery: this.state.delivery,
             productTimeDD: this.state.productTimeDD,
             productTimeMM: this.state.productTimeMM,
             productTimeYYYY: this.state.productTimeYYYY,
             cook: this.state.cook
         }

         axios.post("http://localhost:8080/rest/product/",product)
             .then(response =>{
                 if(response.data != null){
                     this.setState(this.initialState);
                     alert("Thank for your sharing")
                 }
             });
         }



    productChange(event){
        this.setState({
        [event.target.name]:event.target.value
        })
    }

    render() {

        const{productName, price, delivery,productTimeDD,productTimeMM,productTimeYYYY,cook} = this.state

        return(<Card className="border border-dark bg-dark text-white ">
            <Card.Header>Share a meal</Card.Header>
            <Card.Body>
                <Form onSubmit={this.submitProduct} id={"productFormId"}>
                    <Form.Row>
                        <Form.Group as={Col} controlId="formGridName">
                            <Form.Label>Name</Form.Label>
                            <Form.Control
                                          autoComplete={"OFF"}
                                          required
                                          type="name"
                                          className={"bg-dark text-white "}
                                          placeholder="Enter name"
                                          name="productName"
                                          value={productName}
                                          onChange={this.productChange}
                            />
                        </Form.Group>

                        <Form.Group as={Col} controlId="formGridPrice">
                            <Form.Label>Price</Form.Label>
                            <Form.Control
                                required
                                type="price"
                                className={"bg-dark text-white "}
                                placeholder="Price"
                                name="price"
                                value={price}
                                onChange={this.productChange}
                                autoComplete={"OFF"}
                            />
                        </Form.Group>

                    </Form.Row>

                    <Form.Group as={Col} controlId="formGridDelivery">
                        <Form.Label>Delivery</Form.Label>
                        <Form.Control
                            required
                            type="delivery"
                            className={"bg-dark text-white "}
                            placeholder="Delivery"
                            name="delivery"
                            value={delivery}
                            onChange={this.productChange}
                            autoComplete={"OFF"}
                        />
                    </Form.Group>

                    <Form.Row>
                    <Form.Group controlId="exampleForm.SelectCustomSizeSmTimeDD">
                        <Form.Label>Time dd -</Form.Label>
                        <Form.Control required
                                      as="select"
                                      size="sm"
                                      name={"productTimeDD"} value={productTimeDD}
                                      onChange={this.productChange} >
                            autoComplete={"OFF"}
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                            <option>6</option>
                            <option>7</option>
                            <option>8</option>
                            <option>9</option>
                            <option>10</option>
                            <option>11</option>
                            <option>12</option>
                            <option>13</option>
                            <option>14</option>
                            <option>15</option>
                            <option>16</option>
                            <option>17</option>
                            <option>18</option>
                            <option>19</option>
                            <option>20</option>
                            <option>21</option>
                            <option>22</option>
                            <option>23</option>
                            <option>24</option>
                            <option>25</option>
                            <option>26</option>
                            <option>27</option>
                            <option>28</option>
                            <option>29</option>
                            <option>30</option>
                            <option>31</option>
                        </Form.Control>
                    </Form.Group>
                        <Form.Group controlId="exampleForm.SelectCustomSizeSmTimeMM">
                            <Form.Label> mm-</Form.Label>
                            <Form.Control required
                                          as="select"
                                          size="sm"
                                          name={"productTimeMM"}
                                          value={productTimeMM}
                                          onChange={this.productChange}>
                                autoComplete={"OFF"}
                                <option>1</option>
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                                <option>6</option>
                                <option>7</option>
                                <option>8</option>
                                <option>9</option>
                                <option>10</option>
                                <option>11</option>
                                <option>12</option>
                            </Form.Control>
                        </Form.Group>
                        <Form.Group controlId="exampleForm.SelectCustomSizeSmYYYY">
                            <Form.Label>yyyy</Form.Label>
                            <Form.Control required
                                          as="select"
                                          size="sm"
                                          name={"productTimeYYYY"}value={productTimeYYYY}
                                          onChange={this.productChange}>
                                autoComplete={"OFF"}
                                <option>2020</option>
                                <option>2021</option>
                                <option>2022</option>
                                <option>2023</option>
                                <option>2024</option>
                                <option>2025</option>
                                <option>2026</option>
                                <option>2027</option>
                                <option>2028</option>
                                <option>2029</option>
                                <option>2030</option>
                                <option>2031</option>
                                <option>2032</option>
                                <option>2033</option>
                            </Form.Control>
                        </Form.Group>
                        </Form.Row>

                    <Form.Row>
                        <Form.Group as={Col} controlId="formGridZipCook">
                            <Form.Label>cook - asta trebuie sa se puna automat cand esti logat</Form.Label>
                            <Form.Control
                                autoComplete={"OFF"}
                                required
                                          name={"cook"}
                                          className={"bg-dark text-white "}
                                          value={cook}
                                          onChange={this.productChange}/>

                        </Form.Group>
                    </Form.Row>

                    <Form.Check
                        controlId="formGridDescription"
                        required
                        type="switch"
                        id="custom-switch"
                        label="Description with check fields TODO"
                        name={"descriere"}
                        value={this.state.descriere}
                        onChange={this.productChange}
                    />
                    <p></p>
                    <Button
                        variant="primary"
                        type="submit"
                        className={"bg-dark text white"}>
                        Submit
                    </Button>
                </Form>
            </Card.Body>
            </Card>
                )
    }
}
export default PostProduct