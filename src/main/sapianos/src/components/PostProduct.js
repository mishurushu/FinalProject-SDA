import React from 'react'
import {Card,Form,Col,Button} from "react-bootstrap";

class PostProduct extends  React.Component{
    render() {
        return(<Card className="border border-dark bg-dark text-white ">
            <Card.Header>Share a meal</Card.Header>
            <Card.Body>
                <Form>
                    <Form.Row>
                        <Form.Group as={Col} controlId="formGridEmail">
                            <Form.Label>Name</Form.Label>
                            <Form.Control type="name"
                                          className={"bg-dark text white"}
                                          placeholder="Enter name" />
                        </Form.Group>

                        <Form.Group as={Col} controlId="formGridPassword">
                            <Form.Label>Price</Form.Label>
                            <Form.Control type="price" className={"bg-dark text white"} placeholder="Price" />
                        </Form.Group>
                    </Form.Row>

                    <Form.Group controlId="formGridAddress1">
                        <Form.Label>Delivery</Form.Label>
                        <Form.Control className={"bg-dark text white"} placeholder="ex: country,city,str,nb" />
                    </Form.Group>

                    <Form.Row>
                    <Form.Group controlId="exampleForm.SelectCustomSizeSm">
                        <Form.Label>Time dd</Form.Label>
                        <Form.Control as="select" size="sm" custom >
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
                        <Form.Group controlId="exampleForm.SelectCustomSizeSm">
                            <Form.Label>mm</Form.Label>
                            <Form.Control as="select" size="sm" custom>
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
                        <Form.Group controlId="exampleForm.SelectCustomSizeSm">
                            <Form.Label>yyyy</Form.Label>
                            <Form.Control as="select" size="sm" custom>
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
                        <Form.Group as={Col} controlId="formGridZip">
                            <Form.Label>cook - asta trebuie sa se puna automat</Form.Label>
                            <Form.Control className={"bg-dark text white"} />
                        </Form.Group>
                    </Form.Row>

                    <Form.Check
                        type="switch"
                        id="custom-switch"
                        label="Description with check filds TODO"
                    />
                    <p></p>
                    <Button variant="primary" type="submit" className={"bg-dark text white"}>
                        Submit
                    </Button>
                </Form>
            </Card.Body>
            </Card>
                )
    }
}
export default PostProduct